package ca.uhn.fhir.rest.method;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2016 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.AbstractHttpEntity;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.valueset.BundleTypeEnum;

public class HttpPostClientInvocation extends BaseHttpClientInvocationWithContents {


	public HttpPostClientInvocation(FhirContext theContext, IBaseResource theResource, String theUrlExtension) {
		super(theContext, theResource, theUrlExtension);
	}

	public HttpPostClientInvocation(FhirContext theContext, IBaseResource theResource) {
		super(theContext, theResource, null);
	}

	public HttpPostClientInvocation(FhirContext theContext, TagList theTagList, String... theUrlExtension) {
		super(theContext, theTagList, theUrlExtension);
	}

	public HttpPostClientInvocation(FhirContext theContext, List<? extends IBaseResource> theResources, BundleTypeEnum theBundleType) {
		super(theContext, theResources, theBundleType);
	}

	public HttpPostClientInvocation(FhirContext theContext, Bundle theBundle) {
		super(theContext, theBundle);
	}

	public HttpPostClientInvocation(FhirContext theContext, String theContents, boolean theIsBundle, String theUrlExtension) {
		super(theContext, theContents, theIsBundle, theUrlExtension);
	}

	public HttpPostClientInvocation(FhirContext theContext, Map<String, List<String>> theParams, String... theUrlExtension) {
		super(theContext, theParams, theUrlExtension);
	}

	@Override
	protected HttpPost createRequest(StringBuilder theUrlBase, AbstractHttpEntity theEntity) {
		HttpPost retVal = new HttpPost(theUrlBase.toString());
		retVal.setEntity(theEntity);
		return retVal;
	}

}
