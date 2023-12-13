/*
 * Copyright (c) 2021 LG Electronics Inc.
 * SPDX-License-Identifier: AGPL-3.0-only 
 */

package oss.fosslight.service;

import oss.fosslight.api.dto.GetOSSDetailsDto;
import oss.fosslight.api.dto.ListOssDto;

import java.util.List;
import java.util.Map;

public interface ApiOssService {
	public List<Map<String, Object>> getOssInfo(Map<String, Object> paramMap);
	
	public List<Map<String, Object>> getOssInfoByDownloadLocation(String downloadLocation);
	
	public List<Map<String, Object>> getLicenseInfo(String licenseName);
	
	String[] getOssNickNameListByOssName(String ossName);

	ListOssDto.Result listOss(ListOssDto.Request request);
	GetOSSDetailsDto.Result getOss(String id);
}
