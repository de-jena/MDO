/**
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubFactoryImpl extends EFactoryImpl implements GithubFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GithubFactory init() {
		try {
			GithubFactory theGithubFactory = (GithubFactory)EPackage.Registry.INSTANCE.getEFactory(GithubPackage.eNS_URI);
			if (theGithubFactory != null) {
				return theGithubFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GithubFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GithubPackage.GITHUB_WEBHOOK: return createGithubWebhook();
			case GithubPackage.PAYLOAD: return createPayload();
			case GithubPackage.REPOSITORY: return createRepository();
			case GithubPackage.OWNER: return createOwner();
			case GithubPackage.LICENSE: return createLicense();
			case GithubPackage.PUSHER: return createPusher();
			case GithubPackage.SENDER: return createSender();
			case GithubPackage.INSTALLATION: return createInstallation();
			case GithubPackage.COMMIT: return createCommit();
			case GithubPackage.AUTHOR: return createAuthor();
			case GithubPackage.COMMITTER: return createCommitter();
			case GithubPackage.HEAD_COMMIT: return createHead_commit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubWebhook createGithubWebhook() {
		GithubWebhookImpl githubWebhook = new GithubWebhookImpl();
		return githubWebhook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payload createPayload() {
		PayloadImpl payload = new PayloadImpl();
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pusher createPusher() {
		PusherImpl pusher = new PusherImpl();
		return pusher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sender createSender() {
		SenderImpl sender = new SenderImpl();
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Installation createInstallation() {
		InstallationImpl installation = new InstallationImpl();
		return installation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit createCommit() {
		CommitImpl commit = new CommitImpl();
		return commit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Committer createCommitter() {
		CommitterImpl committer = new CommitterImpl();
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Head_commit createHead_commit() {
		Head_commitImpl head_commit = new Head_commitImpl();
		return head_commit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubPackage getGithubPackage() {
		return (GithubPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GithubPackage getPackage() {
		return GithubPackage.eINSTANCE;
	}

} //GithubFactoryImpl
