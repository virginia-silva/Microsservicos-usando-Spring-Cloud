package one.digitalinnovation.experts.productcatalog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@Configuration
@EnableReactiveElasticsearchRepositories(basePackages = "one.digitalinnovation.experts.productcatalog.repository")
public class ElasticSearchConfig {
}
