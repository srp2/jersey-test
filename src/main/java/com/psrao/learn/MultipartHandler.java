package com.psrao.learn;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.BodyPart;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.springframework.stereotype.Component;


@Component
@Path("/upload")
@Consumes("multipart/*")
@Produces("text/text")
public class MultipartHandler {
	@POST
	public String upload(MultiPart request) {
		StringBuffer response = new StringBuffer();
		for (BodyPart part : request.getBodyParts()) {
			if (MediaType.APPLICATION_JSON_TYPE.isCompatible(part.getMediaType())) {
				response.append(part.getEntityAs(JsonModel.class));
			} else if (MediaType.APPLICATION_XML_TYPE.isCompatible(part.getMediaType())) {
				response.append(part.getEntityAs(XmlModel.class));
			}
			response.append(System.lineSeparator());
		}
		return response.toString();
	}
}