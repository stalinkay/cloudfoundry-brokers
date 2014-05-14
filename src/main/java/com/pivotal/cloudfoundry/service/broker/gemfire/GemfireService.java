package com.pivotal.cloudfoundry.service.broker.gemfire;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.pivotal.cloudfoundry.service.broker.CloudFoundryService;

public class GemfireService extends CloudFoundryService {

	public static final String GEMFIRE_SERVICE_ID = "5531b971-5698-4816-a7ac-6abz2e347688";
	public static final String GEMFIRE_SERVICE_NAME = "pivotal-gemfire";
	public static final String GEMFIRE_SERVICE_DESC = "Gemfire service for application development and testing";
	public static final String GEMFIRE_IMAGE = "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";
	public static final List<String> _gfTags = Collections.unmodifiableList(Arrays.asList("nosql", "gemfire"));
	
	public GemfireService() {
		super(GEMFIRE_SERVICE_ID, GEMFIRE_SERVICE_NAME, GEMFIRE_SERVICE_DESC);
		addTags(_gfTags);
		addMetadata("imageUrl", "data:image/png;base64," + GEMFIRE_IMAGE);
	}

}
