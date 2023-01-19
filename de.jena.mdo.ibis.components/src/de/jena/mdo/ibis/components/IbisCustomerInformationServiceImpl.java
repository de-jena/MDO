/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.ibis.components;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.ibis.apis.IbisCustomerInformationService;
import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
@Component(name = "IbisCustomerInformationService", scope = ServiceScope.PROTOTYPE)
public class IbisCustomerInformationServiceImpl implements IbisCustomerInformationService {

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getAllData()
	 */
	@Override
	public CustomerInformationServiceGetAllDataResponseStructure getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentAnnouncement()
	 */
	@Override
	public CustomerInformationServiceGetCurrentAnnouncementResponseStructure getCurrentAnnouncement() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentConnectionInformation()
	 */
	@Override
	public CustomerInformationServiceGetCurrentConnectionInformationResponseStructure getCurrentConnectionInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentDisplayContent()
	 */
	@Override
	public CustomerInformationServiceGetCurrentDisplayContentResponseStructure getCurrentDisplayContent() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopPoint()
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopPointResponseStructure getCurrentStopPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopIndex()
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopIndexResponseStructure getCurrentStopIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getTripData()
	 */
	@Override
	public CustomerInformationServiceGetTripDataResponseStructure getTripData() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getVehicleData()
	 */
	@Override
	public CustomerInformationServiceGetVehicleDataResponseStructure getVehicleData() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeAllData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeAllData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeAllData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeAllData(UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentAnnouncement(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentAnnouncement(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentAnnouncement(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentAnnouncement(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentConnectionInformation(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentConnectionInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentDisplayContent(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentDisplayContent(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentDisplayContent(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentDisplayContent(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopPoint(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentStopPoint(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopPoint(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentStopPoint(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopIndex(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentStopIndex(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopIndex(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentStopIndex(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeTripData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeTripData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeTripData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeTripData(UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeVehicleData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeVehicleData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeVehicleData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeVehicleData(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#retrievePartialStopSequence(de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure)
	 */
	@Override
	public CustomerInformationServiceRetrievePartialStopSequenceResponseStructure retrievePartialStopSequence(
			CustomerInformationServiceRetrievePartialStopSequenceRequestStructure requestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

}
