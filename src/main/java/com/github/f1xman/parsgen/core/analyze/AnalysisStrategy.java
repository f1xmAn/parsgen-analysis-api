package com.github.f1xman.parsgen.core.analyze;

import com.github.f1xman.parsgen.core.analyze.model.PageFeatures;

import java.net.URL;
import java.util.List;

public interface AnalysisStrategy {

    List<PageFeatures> analyze(URL url, String content);

    boolean supports(URL url);
}
