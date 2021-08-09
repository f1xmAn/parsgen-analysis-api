package com.github.f1xman.parsgen.core.analyze;

import com.github.f1xman.parsgen.core.analyze.model.LoadedPage;
import com.github.f1xman.parsgen.core.analyze.model.PageFeatures;

import java.net.URL;

public interface AnalysisStrategy {
    PageFeatures analyze(LoadedPage page);

    boolean supports(URL url);
}
