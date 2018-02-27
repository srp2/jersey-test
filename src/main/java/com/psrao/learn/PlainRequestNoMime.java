package com.psrao.learn;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/upload")
@Consumes("application/*")
@Produces("text/text")
public class PlainRequestNoMime {
	@POST
	public String upload(String request) {

		return request;
	}

}
