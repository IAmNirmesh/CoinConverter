package rahul.nirmesh.coinconverter.remote;

import rahul.nirmesh.coinconverter.model.Coin;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by N I R M E S H on 2017-08-16.
 */

public interface CoinService {

    @GET("data/price")
    Call<Coin> calculateValue(@Query("fsym") String from, @Query("tsyms") String to);
}
