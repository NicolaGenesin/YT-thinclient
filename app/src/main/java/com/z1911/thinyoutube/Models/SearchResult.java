package com.z1911.thinyoutube.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nicola on 30/07/2015.
 */
public class SearchResult {


    /**
     * kind : youtube#searchListResponse
     * nextPageToken : CAUQAA
     * pageInfo : {"totalResults":1000000,"resultsPerPage":5}
     * etag : "iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/ovOImZRwigaQnHhj92wrvCplMhM"
     * items : [{"snippet":{"publishedAt":"2015-07-29T19:00:02.000Z","description":"'Kings Never Die', from the Southpaw soundtrack, out now on iTunes: http://smarturl.it/KingsNeverDie See Southpaw, in theaters now http://eminem.com ...","title":"Eminem - Kings Never Die (Lyric Video) ft. Gwen Stefani","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"},"kind":"youtube#searchResult","etag":"\"iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/x-D-6J001ahFbFSYazYo_TAjtXM\"","id":{"kind":"youtube#video","videoId":"rpERSigjqXs"}},{"snippet":{"publishedAt":"2014-11-24T17:00:02.000Z","description":"Eminem ft. Sia - Guts Over Fear SHADYXV out now! http://smarturl.it/ShadyXViT.","title":"Eminem - Guts Over Fear ft. Sia","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/0AqnCSdkjQ0/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/0AqnCSdkjQ0/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/0AqnCSdkjQ0/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"},"kind":"youtube#searchResult","etag":"\"iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/zyJWNvxc4vqwjNXx8E3Z4okA9go\"","id":{"kind":"youtube#video","videoId":"0AqnCSdkjQ0"}},{"snippet":{"publishedAt":"2015-07-10T04:00:01.000Z","description":"'Kings Never Die', from the Southpaw soundtrack, out now on iTunes: http://smarturl.it/KingsNeverDie See Southpaw, in theaters now http://eminem.com ...","title":"Eminem - Kings Never Die (Audio) ft. Gwen Stefani","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/7YAVn466YBc/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/7YAVn466YBc/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/7YAVn466YBc/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"},"kind":"youtube#searchResult","etag":"\"iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/BqgYX9ZM7WqwY7Vs304wj24M8P0\"","id":{"kind":"youtube#video","videoId":"7YAVn466YBc"}},{"snippet":{"publishedAt":"2010-06-05T05:02:39.000Z","description":"Music video by Eminem performing Not Afraid. (C) 2010 Aftermath Records #VEVOCertified on September 11, 2010.http://www.vevo.com/certified ...","title":"Eminem - Not Afraid","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"},"kind":"youtube#searchResult","etag":"\"iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/OVC50zFcYtG8ZJp6pfAxtwlODPc\"","id":{"kind":"youtube#video","videoId":"j5-yKhDd64s"}},{"snippet":{"publishedAt":"2013-11-27T16:50:00.000Z","description":"Download Eminem's 'MMLP2' Album on iTunes now:http://smarturl.it/MMLP2 Credits below Video Director: Rich Lee Video Producer: Justin Diener Video ...","title":"Eminem - Rap God (Explicit)","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"},"kind":"youtube#searchResult","etag":"\"iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/0kr2kiGpEYE-GDjRboA6I7vbFj8\"","id":{"kind":"youtube#video","videoId":"XbGs_qK2PQA"}}]
     */
    private String kind;
    private String nextPageToken;
    private PageInfoEntity pageInfo;
    private String etag;
    private List<ItemsEntity> items;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public void setPageInfo(PageInfoEntity pageInfo) {
        this.pageInfo = pageInfo;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public PageInfoEntity getPageInfo() {
        return pageInfo;
    }

    public String getEtag() {
        return etag;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public class PageInfoEntity {
        /**
         * totalResults : 1000000
         * resultsPerPage : 5
         */
        private int totalResults;
        private int resultsPerPage;

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }
    }

    public class ItemsEntity {
        /**
         * snippet : {"publishedAt":"2015-07-29T19:00:02.000Z","description":"'Kings Never Die', from the Southpaw soundtrack, out now on iTunes: http://smarturl.it/KingsNeverDie See Southpaw, in theaters now http://eminem.com ...","title":"Eminem - Kings Never Die (Lyric Video) ft. Gwen Stefani","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/mqdefault.jpg"}},"channelId":"UC20vb-R_px4CguHzzBPhoyQ","channelTitle":"EminemVEVO","liveBroadcastContent":"none"}
         * kind : youtube#searchResult
         * etag : "iDqJ1j7zKs4x3o3ZsFlBOwgWAHU/x-D-6J001ahFbFSYazYo_TAjtXM"
         * id : {"kind":"youtube#video","videoId":"rpERSigjqXs"}
         */
        private SnippetEntity snippet;
        private String kind;
        private String etag;
        private IdEntity id;

        public void setSnippet(SnippetEntity snippet) {
            this.snippet = snippet;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public void setEtag(String etag) {
            this.etag = etag;
        }

        public void setId(IdEntity id) {
            this.id = id;
        }

        public SnippetEntity getSnippet() {
            return snippet;
        }

        public String getKind() {
            return kind;
        }

        public String getEtag() {
            return etag;
        }

        public IdEntity getId() {
            return id;
        }

        public class SnippetEntity {
            /**
             * publishedAt : 2015-07-29T19:00:02.000Z
             * description : 'Kings Never Die', from the Southpaw soundtrack, out now on iTunes: http://smarturl.it/KingsNeverDie See Southpaw, in theaters now http://eminem.com ...
             * title : Eminem - Kings Never Die (Lyric Video) ft. Gwen Stefani
             * thumbnails : {"default":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/default.jpg"},"high":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/hqdefault.jpg"},"medium":{"url":"https://i.ytimg.com/vi/rpERSigjqXs/mqdefault.jpg"}}
             * channelId : UC20vb-R_px4CguHzzBPhoyQ
             * channelTitle : EminemVEVO
             * liveBroadcastContent : none
             */
            private String publishedAt;
            private String description;
            private String title;
            private ThumbnailsEntity thumbnails;
            private String channelId;
            private String channelTitle;
            private String liveBroadcastContent;

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setThumbnails(ThumbnailsEntity thumbnails) {
                this.thumbnails = thumbnails;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public void setChannelTitle(String channelTitle) {
                this.channelTitle = channelTitle;
            }

            public void setLiveBroadcastContent(String liveBroadcastContent) {
                this.liveBroadcastContent = liveBroadcastContent;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String getDescription() {
                return description;
            }

            public String getTitle() {
                return title;
            }

            public ThumbnailsEntity getThumbnails() {
                return thumbnails;
            }

            public String getChannelId() {
                return channelId;
            }

            public String getChannelTitle() {
                return channelTitle;
            }

            public String getLiveBroadcastContent() {
                return liveBroadcastContent;
            }

            public class ThumbnailsEntity {
                /**
                 * default : {"url":"https://i.ytimg.com/vi/rpERSigjqXs/default.jpg"}
                 * high : {"url":"https://i.ytimg.com/vi/rpERSigjqXs/hqdefault.jpg"}
                 * medium : {"url":"https://i.ytimg.com/vi/rpERSigjqXs/mqdefault.jpg"}
                 */
                @SerializedName("default")
                private DefaultXEntity defaultX;
                private HighEntity high;
                private MediumEntity medium;

                public void setDefaultX(DefaultXEntity defaultX) {
                    this.defaultX = defaultX;
                }

                public void setHigh(HighEntity high) {
                    this.high = high;
                }

                public void setMedium(MediumEntity medium) {
                    this.medium = medium;
                }

                public DefaultXEntity getDefaultX() {
                    return defaultX;
                }

                public HighEntity getHigh() {
                    return high;
                }

                public MediumEntity getMedium() {
                    return medium;
                }

                public class DefaultXEntity {
                    /**
                     * url : https://i.ytimg.com/vi/rpERSigjqXs/default.jpg
                     */
                    private String url;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getUrl() {
                        return url;
                    }
                }

                public class HighEntity {
                    /**
                     * url : https://i.ytimg.com/vi/rpERSigjqXs/hqdefault.jpg
                     */
                    private String url;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getUrl() {
                        return url;
                    }
                }

                public class MediumEntity {
                    /**
                     * url : https://i.ytimg.com/vi/rpERSigjqXs/mqdefault.jpg
                     */
                    private String url;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getUrl() {
                        return url;
                    }
                }
            }
        }

        public class IdEntity {
            /**
             * kind : youtube#video
             * videoId : rpERSigjqXs
             */
            private String kind;
            private String videoId;

            public void setKind(String kind) {
                this.kind = kind;
            }

            public void setVideoId(String videoId) {
                this.videoId = videoId;
            }

            public String getKind() {
                return kind;
            }

            public String getVideoId() {
                return videoId;
            }
        }
    }
}
