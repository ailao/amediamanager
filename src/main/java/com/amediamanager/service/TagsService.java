/*
 * Copyright 2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amediamanager.service;

import java.util.List;

import com.amediamanager.dao.TagCount;
import com.amediamanager.domain.Video;

public interface TagsService {

	List<TagCount> getTagsForUser(String user);
	List<Video> getVideosForUserByTag(String user, String tagId); 
	void bustCacheForUser(String user);
}
