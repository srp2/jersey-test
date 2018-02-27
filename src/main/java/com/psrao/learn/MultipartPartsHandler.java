package com.psrao.learn;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Component;

@Component
@Path("/uploadParts")
@Consumes("multipart/*")
@Produces("text/text")
public class MultipartPartsHandler {
	@POST
	public String upload(@FormDataParam("json") JsonModel json, @FormDataParam("xml") XmlModel xml) {
		return json + System.lineSeparator() + xml;
	}
}