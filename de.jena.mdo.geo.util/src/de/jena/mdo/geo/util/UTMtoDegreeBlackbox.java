package de.jena.mdo.geo.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.osgi.service.component.annotations.Component;

import de.jena.mdo.asset.traffic.TrafficPackage;
import de.jena.mdo.geo.util.helper.UTMToDegreeHelper;
import de.jena.mdo.model.dbtree.DbtreePackage;


/**
 * 
 * @author mark
 * @since 24.11.2022
 */
@Component(service = UTMtoDegreeBlackbox.class, immediate=true, 
  property = {ModelTransformationConstants.QVT_BLACKBOX + "=true", 
		  ModelTransformationConstants.BLACKBOX_MODULENAME + "=UTMToDegBB", 
		  ModelTransformationConstants.BLACKBOX_QUALIFIED_UNIT_NAME + "=de.jena.mdo.geo.util.UTMtoDegreeBlackbox"})
@Module(packageURIs={DbtreePackage.eNS_URI, TrafficPackage.eNS_URI})
public class UTMtoDegreeBlackbox {
		
	/**
	 * Contextual method that can be called on each {@link com.swarco.sdg.sdgtlc.CommunicationStateType}
	 * @param self the instance the method is called from
	 * @return the double value of the  
	 */
	@Operation(description = "Converts from UTM into degree longitude")
	public static double getLongitude(Double utmEast, Double utmNorth) {
		return UTMToDegreeHelper.getLongitude(utmEast, utmNorth);
	}

	/**
	 * Contextual method that can be called on each {@link com.swarco.sdg.sdgtlc.CommunicationStateType}
	 * @param self the instance the method is called from
	 * @return the double value of the  
	 */
	@Operation(description = "Converts from UTM into degree latitude")
	public static double getLatitude(Double utmEast, Double utmNorth) {
		return UTMToDegreeHelper.getLatitude(utmEast, utmNorth);
	}
}
