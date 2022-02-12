package br.uff.renan.resource_collection;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import br.uff.renan.resource_collection.models.Event;
import br.uff.renan.resource_collection.models.Author;
import br.uff.renan.resource_collection.models.Course;
import br.uff.renan.resource_collection.models.Resource;

@Component
public class SpringDataRestConfig
    implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(
      RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Author.class);
        config.exposeIdsFor(Course.class);
        config.exposeIdsFor(Event.class);
        config.exposeIdsFor(Resource.class);

    cors.addMapping("/*")
        .allowedOrigins("*")
        .allowedMethods("GET", "PUT", "DELETE", "POST", "PATCH")
        .allowCredentials(false).maxAge(3600);
  }
}