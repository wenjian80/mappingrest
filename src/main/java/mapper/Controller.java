package mapper;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {

    private static HashMap phonemapping = new HashMap();
    private static List<Mapping> mappinglist = new ArrayList<>();
    
    private static HashMap bundlemap = new HashMap();
    private static List<BundleType> bundlelist = new ArrayList<>();

    static {
    	//Init mapping of phone to account
    	Mapping mapping = null;
        mapping = new Mapping("A-1111","1111");
        phonemapping.put("1111", mapping);
        mappinglist.add(mapping);
        
        mapping = new Mapping("A-2222","2222");
        phonemapping.put("2222", mapping);
        mappinglist.add(mapping);
        
        mapping = new Mapping("A-2222","2222");
        phonemapping.put("2222", mapping);
        mappinglist.add(mapping);
        
        //init package bundle        
        BundleType bundleType = null;
        bundleType = new BundleType("P3", 15000, 200);
        bundlemap.put("P3", bundleType);
        bundlelist.add(bundleType);
        
        bundleType = new BundleType("P5", 35000, 200);
        bundlemap.put("P5", bundleType);
        bundlelist.add(bundleType);
        
        bundleType = new BundleType("P10", 35000, 200);
        bundlemap.put("P10", bundleType);
        bundlelist.add(bundleType);
        
        
    }
    
    /*
    @RequestMapping("/getbundle")
    public List<BundleType> getBundles() {
    	return bundlelist;
    }
    
    @RequestMapping("/bundle")
    public BundleType bundle(@RequestParam(value="bundle", defaultValue="0000") String bundle) {
    	BundleType bundleType = null;
    	
    	if (bundlemap.containsKey(bundle)) {
    		bundleType = (BundleType) bundlemap.get(bundle);
    	} else {
    		bundleType = new BundleType("0",0, 0);	
    	}
    	    	    	
    	return bundleType;
    }
    
    
    */
    @RequestMapping("/getmap")
    public List<Mapping> getMap() {
    	return mappinglist;
    }
    
    @RequestMapping("/mapping")
    public Mapping mapping(@RequestParam(value="phone", defaultValue="0000") String phone) {
    	Mapping mapping = null;
    	
    	if (phonemapping.containsKey(phone)) {
    		mapping = (Mapping) phonemapping.get(phone);
    	} else {
    		mapping = new Mapping("0000","0000");	
    	}
    	    	    	
    	return mapping;
    }
}
