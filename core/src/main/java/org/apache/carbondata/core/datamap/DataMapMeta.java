/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.carbondata.core.datamap;

import java.util.List;

import org.apache.carbondata.common.annotations.InterfaceAudience;
import org.apache.carbondata.common.annotations.InterfaceStability;
import org.apache.carbondata.core.scan.filter.intf.ExpressionType;

/**
 * Metadata of the datamap, set by DataMap developer
 */
@InterfaceAudience.Developer("DataMap")
@InterfaceStability.Evolving
public class DataMapMeta {
  private String dataMapName;

  private List<String> indexedColumns;

  private List<ExpressionType> optimizedOperation;

  public DataMapMeta(List<String> indexedColumns, List<ExpressionType> optimizedOperation) {
    this.indexedColumns = indexedColumns;
    this.optimizedOperation = optimizedOperation;
  }

  public DataMapMeta(String dataMapName, List<String> indexedColumns,
      List<ExpressionType> optimizedOperation) {
    this(indexedColumns, optimizedOperation);
    this.dataMapName = dataMapName;
  }

  public String getDataMapName() {
    return dataMapName;
  }

  public List<String> getIndexedColumns() {
    return indexedColumns;
  }

  public List<ExpressionType> getOptimizedOperation() {
    return optimizedOperation;
  }

  @Override
  public String toString() {
    return "DataMapMeta{" + "dataMapName='" + dataMapName + '\'' + ", indexedColumns="
        + indexedColumns + ", optimizedOperation=" + optimizedOperation + '}';
  }
}
