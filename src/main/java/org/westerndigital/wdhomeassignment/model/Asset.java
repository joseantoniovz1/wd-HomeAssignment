package org.westerndigital.wdhomeassignment.model;

import lombok.Builder;
import lombok.Value;

import java.net.URL;

@Value
@Builder
public class Asset {

    String name;
    String key;
    URL url;
}
