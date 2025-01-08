/**
 */
package de.jena.mdo.github.webhook.model.githubWebhook.util;

import de.jena.mdo.github.webhook.model.githubWebhook.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage
 * @generated
 */
public class GithubAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GithubPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GithubPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubSwitch<Adapter> modelSwitch =
		new GithubSwitch<Adapter>() {
			@Override
			public Adapter caseGithubWebhook(GithubWebhook object) {
				return createGithubWebhookAdapter();
			}
			@Override
			public Adapter casePayload(Payload object) {
				return createPayloadAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseOwner(Owner object) {
				return createOwnerAdapter();
			}
			@Override
			public Adapter caseLicense(License object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter casePusher(Pusher object) {
				return createPusherAdapter();
			}
			@Override
			public Adapter caseSender(Sender object) {
				return createSenderAdapter();
			}
			@Override
			public Adapter caseInstallation(Installation object) {
				return createInstallationAdapter();
			}
			@Override
			public Adapter caseCommit(Commit object) {
				return createCommitAdapter();
			}
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseCommitter(Committer object) {
				return createCommitterAdapter();
			}
			@Override
			public Adapter caseHead_commit(Head_commit object) {
				return createHead_commitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook <em>Webhook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook
	 * @generated
	 */
	public Adapter createGithubWebhookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload
	 * @generated
	 */
	public Adapter createPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner
	 * @generated
	 */
	public Adapter createOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Pusher
	 * @generated
	 */
	public Adapter createPusherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Installation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Installation
	 * @generated
	 */
	public Adapter createInstallationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit
	 * @generated
	 */
	public Adapter createCommitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Committer <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Committer
	 * @generated
	 */
	public Adapter createCommitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit <em>Head commit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit
	 * @generated
	 */
	public Adapter createHead_commitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GithubAdapterFactory
