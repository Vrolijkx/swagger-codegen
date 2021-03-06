package io.swagger.api;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import io.swagger.api.*;
import io.swagger.api.NotFoundException;
import io.swagger.model.Pet;


public abstract class PetApiService {
      public abstract Response addPet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByStatus(List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext)
      throws NotFoundException;
}
