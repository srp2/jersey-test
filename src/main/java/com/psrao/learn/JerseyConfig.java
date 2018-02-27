package com.psrao.learn;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MultiPartFeature.class);
		register(MultipartHandler.class);
		register(PlainRequestNoMime.class);
		register(MultipartPartsHandler.class);
		register(Endpoint.class);
		register(ReverseEndpoint.class);
	}

}
