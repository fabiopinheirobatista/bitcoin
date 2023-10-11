package br.com.fabio.resource;

import jakarta.inject.Inject;
import br.com.fabio.model.Bitcoin;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import br.com.fabio.service.BitcoinService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bitcoins")
public class BitcoinResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listarBitcoinResource() {
        //
        return bitcoinService.listarBitcoinService();
    }

}
