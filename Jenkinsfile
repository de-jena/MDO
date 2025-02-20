pipeline  {
    agent any

	environment {
		imagename = 'scj/mdo'
		dockerImage = ''
		JAVA_OPTS = "-Xms4096m -Xmx4096m -XX:MaxMetaspaceSize=1024m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
	}

    tools {
        jdk 'OpenJDK21'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    
    stages {
    
    	stage('clean workspace and checkout') {
			steps {
				cleanWs()
				checkout scm
			}
		}
    
    	stage('Build') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}
		
		stage('Skipping Integration Tests') {

			when { 
                branch 'Skipping' 
            }

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"

				script {
				
					sh "./gradlew testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

					junit '**/generated/test-reports/**/*.xml'
				}
			}
		}
    
        
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                echo "I am building on ${env.JOB_NAME}"
                sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/de-jena/MDO"
                sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/de-jena/MDO/*"
                sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/de-jena/MDO"
            }
        }
        
        stage('Resolve Application'){

			steps  {
				echo "I am resolving applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew de.jena.mdo.runtime:resolve.de.jena.mdo.runtime_base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}

        stage('Export Application'){

			steps  {
				echo "I am exporting applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew de.jena.mdo.runtime:export.de.jena.mdo.runtime_docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}
		
        stage('Resolve Playground App'){

			steps  {
				echo "I am resolving Playground Application on branch: ${env.GIT_BRANCH}"

                sh "./gradlew de.jena.mdo.playground.app:resolve.playground --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}

        stage('Export Playground App'){

			steps  {
				echo "I am exporting Playground Application on branch: ${env.GIT_BRANCH}"

                sh "./gradlew de.jena.mdo.playground.app:export.playground --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}

        stage('Resolve Derby export'){

			steps  {
				echo "I am exporting applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew de.jena.mdo.jdbc.example:resolve.launch-derby --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}
/*
        stage('Skipping Run Derby Export Application'){
			steps  {
				echo "I am exporting applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew  de.jena.mdo.jdbc.example:run.launch-derby --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}
*/
		
        stage('Prepare Docker'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
    			sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

        stage('Docker image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
    			
			    step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker',
							cloud: 'docker',
							tagsString: """registry-git.jena.de/scj/udp/mdo:latest
                                        registry-git.jena.de/scj/udp/mdo:0.1.0.${env.BUILD_ID}""",
							pushOnSuccess: true,
							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/mdo:latest
                                        devel.data-in-motion.biz:6000/scj/mdo:0.1.0.${env.BUILD_ID}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])

			}
		}
		
		stage('Archive Results') {
	    	when {
				branch 'main'
			}
	        steps {
				
                sh " cp de.jena.mdo.playground.app/generated/distributions/executable/playground.jar de.jena.mdo.playground.app/generated/distributions/executable/playground.zip'
	        	archiveArtifacts 'de.jena.mdo.playground.app/generated/distributions/executable/playground.zip'
	      	}
	    }
	}
}
