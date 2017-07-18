/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.newsapp;

/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /** Section of the article */
    private String mSection;

    /** Title of the article */
    private String mTitle;

    /** Time of the article */
    private String mTime;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param section is the section of the article
     * @param title is the title of the article
     * @param time is the time of the article
     * @param url is the website URL to find the article
     */
    public Article(String section, String title, String time, String url) {
        mSection = section;
        mTitle=title;
        mTime = time;
        mUrl = url;
    }

    /**
     * Returns the title of the article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the time of the article.
     */
    public String getTime() {
        return mTime;
    }

    /**
     * Returns the website URL to find the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
