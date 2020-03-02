/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.db.bind.adapter;

import static org.apache.commons.lang3.math.NumberUtils.toLong;
import static org.apache.openmeetings.db.bind.adapter.CDATAAdapter.CDATA_BEGIN;
import static org.apache.openmeetings.db.bind.adapter.CDATAAdapter.CDATA_END;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LongAdapter extends XmlAdapter<String, Long> {

	@Override
	public String marshal(Long v) throws Exception {
		return CDATA_BEGIN + (v == null ? "0" : v.toString()) + CDATA_END;
	}

	@Override
	public Long unmarshal(String v) throws Exception {
		return toLong(v);
	}
}
