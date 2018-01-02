/* 
 * Copyright 2017 Federal Highway Administration.
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
package imrcp.store;

/**
 * This class is used to store data on the units of observations from a given
 * source
 */
public class SourceUnit
{

	/**
	 * Integer obs type id. Must be an obs type for the ObsType class
	 */
	public int m_nObsTypeId;

	/**
	 * Contributor id
	 */
	public int m_nContribId;

	/**
	 * Units used by this source
	 */
	public String m_sUnit;


	/**
	 * Creates a new SourceUnit from a line of the csv file with SourceUnit data
	 *
	 * @param sLine
	 */
	public SourceUnit(String sLine)
	{
		String[] sSplit = sLine.split(",");
		m_nObsTypeId = Integer.valueOf(sSplit[0], 36);
		m_nContribId = Integer.valueOf(sSplit[1], 36);
		m_sUnit = sSplit[2];
	}
}
