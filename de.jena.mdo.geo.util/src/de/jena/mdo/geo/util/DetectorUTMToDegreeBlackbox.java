package de.jena.mdo.geo.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.jena.mdo.asset.traffic.DETECTOR;
import de.jena.mdo.asset.traffic.TrafficPackage;
import de.jena.mdo.geo.util.helper.UTMToDegreeHelper;

//@Component(service = DetectorUTMToDegreeBlackbox.class, immediate=true, 
//	property = {ModelTransformationConstants.QVT_BLACKBOX + "=true", 
//			ModelTransformationConstants.BLACKBOX_MODULENAME + "=DetectorUTMToDegBB", 
//			ModelTransformationConstants.BLACKBOX_QUALIFIED_UNIT_NAME + "=de.jena.mdo.geo.util.DetectorUTMToDegreeBlackbox"})
//@Module(packageURIs={TrafficPackage.eNS_URI})
public class DetectorUTMToDegreeBlackbox {
	
	@Activate
	public void activate() {
		
		System.out.println("Test");
	}
	
	/**
	 * Contextual method that can be called on each {@link com.swarco.sdg.sdgtlc.CommunicationStateType}
	 * @param self the instance the method is called from
	 * @return the double value of the  
	 */
	@Operation(contextual = true, description = "Converts from UTM into degree longitude")
	public static double getLongitude(DETECTOR detector) {
		return UTMToDegreeHelper.getLongitude(detector.getXCOORD(), detector.getYCOORD());
	}
	
	/**
	 * Contextual method that can be called on each {@link com.swarco.sdg.sdgtlc.CommunicationStateType}
	 * @param self the instance the method is called from
	 * @return the double value of the  
	 */
	@Operation(contextual = true, description = "Converts from UTM into degree latitude")
	public static double getLatitude(DETECTOR detector) {
		return UTMToDegreeHelper.getLatitude(detector.getXCOORD(), detector.getYCOORD());
	}

}
