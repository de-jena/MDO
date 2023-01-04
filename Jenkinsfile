pipeline  {
    agent any

	environment {
		imagename = 'de.jena/mdo'
		dockerImage = ''
		JAVA_OPTS = "-Xms2048m -Xmx2048m -XX:MaxMetaspaceSize=1024m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
	}

    tools {
        jdk 'OpenJDK17'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    
	post {
		success {
			cleanWs()
		}
	}

    stages {
    
    	stage('clean workspace and checkout') {
			steps {
				deleteDir()
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
    
        stage('Main branch release') {
            when { 
                branch 'main' 
            }
            steps {
                echo "I am building on ${env.BRANCH_NAME}"
                sh "./gradlew release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/de-jena/MDO --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
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
        
        stage('Export Application'){

			steps  {
				echo "I am exporting applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew geckoExport --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
			}
		}
		
        stage('Docker image build'){
			when {
				branch 'smart-city-models'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"


				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'de.jena.mdo.runtime/generated/docker',
							cloud: 'docker',
							tagsString: 'devel.data-in-motion.biz:6000/de.jena/mdo:release',
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])

			}
		}
	}
}
