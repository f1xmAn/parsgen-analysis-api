package com.github.f1xman.parsgen.core.analyze;

import com.github.f1xman.parsgen.core.analyze.model.PageFeatures;

import java.net.URL;

public interface AnalysisStrategy {
    PageFeatures analyze(URL url, String content);

    boolean supports(URL url);
}
