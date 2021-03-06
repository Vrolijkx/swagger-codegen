package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;
import io.swagger.client.model.Client;
import retrofit2.Call;
import retrofit2.http.*;

public interface FakeclassnametagsApi {
  /**
   * To test class name in snake case
   * 
   * @param body client model (required)
   * @return Call&lt;Client&gt;
   */
  
  @PATCH("fake_classname_test")
  Call<Client> testClassname(
    @retrofit2.http.Body Client body
  );

}
