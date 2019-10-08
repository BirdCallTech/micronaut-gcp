package io.micronaut.gcp.runtime_configurator;

import io.micronaut.context.env.AbstractPropertySourceLoader;
import io.micronaut.context.env.Environment;
import io.micronaut.context.env.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

public class RuntimeConfiguratorPropertySourceLoader extends AbstractPropertySourceLoader {

    @Override
    protected void processInput(String name, InputStream input, Map<String, Object> finalMap) throws IOException {

    }

    @Override
    public Optional<PropertySource> load(Environment environment) {
        if (isEnabled()) {

        }
        return Optional.empty();
    }
}
