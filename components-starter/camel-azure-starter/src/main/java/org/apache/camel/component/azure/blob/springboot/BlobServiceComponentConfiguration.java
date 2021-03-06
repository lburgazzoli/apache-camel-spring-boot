/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.azure.blob.springboot;

import java.util.Map;
import javax.annotation.Generated;
import com.microsoft.azure.storage.StorageCredentials;
import com.microsoft.azure.storage.blob.CloudBlob;
import org.apache.camel.component.azure.blob.BlobServiceOperations;
import org.apache.camel.component.azure.blob.BlobType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The azure-blob component is used for storing and retrieving blobs from Azure
 * Storage Blob Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.azure-blob")
public class BlobServiceComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the azure-blob component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The Blob Service configuration
     */
    private BlobServiceConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public BlobServiceConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            BlobServiceConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class BlobServiceConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.azure.blob.BlobServiceConfiguration.class;
        /**
         * The blob service client
         */
        private CloudBlob azureBlobClient;
        /**
         * Set the blob meta-data
         */
        private Map blobMetadata;
        private String blobName;
        /**
         * Set the blob offset for the upload or download operations, default is
         * 0
         */
        private Long blobOffset = 0L;
        /**
         * Set a prefix which can be used for listing the blobs
         */
        private String blobPrefix;
        /**
         * Set a blob type, 'blockblob' is default
         */
        private BlobType blobType = BlobType.blockblob;
        /**
         * Close the stream after read or keep it open, default is true
         */
        private Boolean closeStreamAfterRead = true;
        /**
         * Close the stream after write or keep it open, default is true
         */
        private Boolean closeStreamAfterWrite = true;
        private String containerName;
        /**
         * Set the data length for the download or page blob upload operations
         */
        private Long dataLength;
        /**
         * Set the file directory where the downloaded blobs will be saved to
         */
        private String fileDir;
        /**
         * Blob service operation hint to the producer
         */
        private BlobServiceOperations operation = BlobServiceOperations.listBlobs;
        /**
         * Storage resources can be public for reading their content, if this
         * property is enabled then the credentials do not have to be set
         */
        private Boolean publicForRead = false;
        /**
         * Set the minimum read size in bytes when reading the blob content
         */
        private Integer streamReadSize;
        /**
         * Set the size of the buffer for writing block and page blocks
         */
        private Integer streamWriteSize;
        /**
         * Specify if the flat or hierarchical blob listing should be used
         */
        private Boolean useFlatListing = true;
        private String accountName;
        /**
         * Set the storage credentials, required in most cases
         */
        private StorageCredentials credentials;

        public CloudBlob getAzureBlobClient() {
            return azureBlobClient;
        }

        public void setAzureBlobClient(CloudBlob azureBlobClient) {
            this.azureBlobClient = azureBlobClient;
        }

        public Map getBlobMetadata() {
            return blobMetadata;
        }

        public void setBlobMetadata(Map blobMetadata) {
            this.blobMetadata = blobMetadata;
        }

        public String getBlobName() {
            return blobName;
        }

        public void setBlobName(String blobName) {
            this.blobName = blobName;
        }

        public Long getBlobOffset() {
            return blobOffset;
        }

        public void setBlobOffset(Long blobOffset) {
            this.blobOffset = blobOffset;
        }

        public String getBlobPrefix() {
            return blobPrefix;
        }

        public void setBlobPrefix(String blobPrefix) {
            this.blobPrefix = blobPrefix;
        }

        public BlobType getBlobType() {
            return blobType;
        }

        public void setBlobType(BlobType blobType) {
            this.blobType = blobType;
        }

        public Boolean getCloseStreamAfterRead() {
            return closeStreamAfterRead;
        }

        public void setCloseStreamAfterRead(Boolean closeStreamAfterRead) {
            this.closeStreamAfterRead = closeStreamAfterRead;
        }

        public Boolean getCloseStreamAfterWrite() {
            return closeStreamAfterWrite;
        }

        public void setCloseStreamAfterWrite(Boolean closeStreamAfterWrite) {
            this.closeStreamAfterWrite = closeStreamAfterWrite;
        }

        public String getContainerName() {
            return containerName;
        }

        public void setContainerName(String containerName) {
            this.containerName = containerName;
        }

        public Long getDataLength() {
            return dataLength;
        }

        public void setDataLength(Long dataLength) {
            this.dataLength = dataLength;
        }

        public String getFileDir() {
            return fileDir;
        }

        public void setFileDir(String fileDir) {
            this.fileDir = fileDir;
        }

        public BlobServiceOperations getOperation() {
            return operation;
        }

        public void setOperation(BlobServiceOperations operation) {
            this.operation = operation;
        }

        public Boolean getPublicForRead() {
            return publicForRead;
        }

        public void setPublicForRead(Boolean publicForRead) {
            this.publicForRead = publicForRead;
        }

        public Integer getStreamReadSize() {
            return streamReadSize;
        }

        public void setStreamReadSize(Integer streamReadSize) {
            this.streamReadSize = streamReadSize;
        }

        public Integer getStreamWriteSize() {
            return streamWriteSize;
        }

        public void setStreamWriteSize(Integer streamWriteSize) {
            this.streamWriteSize = streamWriteSize;
        }

        public Boolean getUseFlatListing() {
            return useFlatListing;
        }

        public void setUseFlatListing(Boolean useFlatListing) {
            this.useFlatListing = useFlatListing;
        }

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public StorageCredentials getCredentials() {
            return credentials;
        }

        public void setCredentials(StorageCredentials credentials) {
            this.credentials = credentials;
        }
    }
}