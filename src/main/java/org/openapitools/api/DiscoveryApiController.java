package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T03:14:24.819Z[GMT]")

@Controller
@RequestMapping("${openapi.consumerDataStandards.base-path:/cds-au/v1}")
public class DiscoveryApiController implements DiscoveryApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DiscoveryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
