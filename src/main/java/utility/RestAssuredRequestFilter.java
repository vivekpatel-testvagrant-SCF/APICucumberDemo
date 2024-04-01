package utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
public class RestAssuredRequestFilter {
    private static final Logger LOG = LogManager.getLogger(RestAssuredRequestFilter.class);
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        Response response = ctx.next(requestSpec, responseSpec);
        LOG.info("-----------------------------------------------------------------------------------------");
        LOG.info(" Request Method => " + requestSpec.getMethod() +
                "\n Request URI => " + requestSpec.getURI() +
                "\n Request Header =>\n" + requestSpec.getHeaders() +
                "\n Request Body => " + requestSpec.getBody() +
                "\n\n Response Status => "+ response.getStatusLine() +
                "\n Response Header =>\n"+ response.getHeaders() +
                "\n Response Body => " + response.getBody().prettyPrint());
        LOG.info("-----------------------------------------------------------------------------------------");
        return response;
    }
}
