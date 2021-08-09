package com.github.f1xman.parsgen.core.analyze.model;

import com.github.f1xman.parsgen.core.analyze.AnalysisStrategyNotFoundException;
import com.github.f1xman.parsgen.core.analyze.LoadedPageAnalyzer;

public interface LoadedPage {
    PageFeatures analyze(LoadedPageAnalyzer analyzer) throws AnalysisStrategyNotFoundException;
}
