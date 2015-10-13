/*
 * Copyright 2015 Hanks All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hanks.zhe800.model;

import java.util.List;

/**
 * Created by hanks on 15-10-13.
 */
public class JinriChild {

    /**
     * top : {"logo_android":"http://p23.tuan800.net/pic/wireless__52_1439201552056.png.webp","logo_ios":"http://p23.tuan800.net/pic/wireless__52_1439201557577.png.webp","background":{"color":"e20c24"},"search_color":"cf010b","cart_android":"http://p23.tuan800.net/pic/wireless__52_1438335082389.png.webp","cart_ios":"http://p23.tuan800.net/pic/wireless__134_1439201875697.png.webp","tag_bg":{"color":"ffffff","font_before":"545c66","font_after":"e30c26"}}
     * background : {"color":"f6f6f6"}
     * modules : {"module1":[{"id":383,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp","title_android":"","homekey":16},{"id":873,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/442x168.c73c814393378fca7d813a6375af941c.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/442x168.c73c814393378fca7d813a6375af941c.jpg.webp","title_android":"","homekey":18},{"id":349,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/442x168.d3dc2e518a72a7cabfbeafb320b72216.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/442x168.d3dc2e518a72a7cabfbeafb320b72216.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/bkzqn?dcurlid=349"}],"module2":[{"id":507,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/zebjr1013?dcurlid=507"},{"id":399,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/375x168.cabd41c98c4926da82483c50dbcccd7c.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/375x168.cabd41c98c4926da82483c50dbcccd7c.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/pptop10n?dcurlid=399"},{"id":401,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/375x168.e8857d4823ed068d28f5c91a387cd0e4.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/375x168.e8857d4823ed068d28f5c91a387cd0e4.jpg.webp","title_android":"","homekey":1,"value":"http://th5.m.zhe800.com/activity/xianshi?dcurlid=401&pub_page_from=zheclient"},{"id":509,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/375x168.63f4d25e493c9fcf053e78e212efc2d3.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/375x168.63f4d25e493c9fcf053e78e212efc2d3.jpg.webp","title_android":"","homekey":1,"value":"http://th5.m.zhe800.com/h5public/youpinhui?dcurlid=509&pub_page_from=zheclient"}],"module3":[{"id":355,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp","title_android":"","homekey":7},{"id":491,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/236x318.c3e59770608a4a10a088a367982c3f93.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/236x318.c3e59770608a4a10a088a367982c3f93.jpg.webp","title_android":"","homekey":15},{"id":357,"pic_android":"","pic_ios":"","title_android":"","homekey":14}],"mobile_pic":"http://p23.tuan800.net/pic/wireless_home_mobile_image51_189_1439804882705.png.webp"}
     * bottom : {"color":"ffffff","icons":[{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidBefore_237_1438252892223.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidAfter_237_1438252905246.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_homeIosBefore_237_1438252921993.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_homeIosAfter_237_1438252929975.png.webp","icon_type":1},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_tagAndroidBefore_237_1438252946794.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_tagAndroidAfter_237_1438252988711.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_tagIosBefore_237_1438253033806.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_tagIosAfter_237_1438253103587.png.webp","icon_type":2},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_brandAndroidBefore_237_1438252954314.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_brandAndroidAfter_237_1438252995928.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_brandIosBefore_237_1438253043136.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_brandIosAfter_237_1438253110874.png.webp","icon_type":3},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_pointAndroidBefore_237_1438252961623.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_pointAndroidAfter_237_1438253003552.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_pointIosBefore_237_1438253050240.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_pointIosAfter_237_1438253116944.png.webp","icon_type":4},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_userAndroidBefore_237_1438252970694.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_userAndroidAfter_237_1438253016428.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_userIosBefore_237_1438253064360.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_userIosAfter_237_1438253122893.png.webp","icon_type":5}]}
     */

    private TopEntity top;
    private BackgroundEntity background;
    private ModulesEntity modules;
    private BottomEntity bottom;

    public TopEntity getTop() {
        return top;
    }

    public void setTop(TopEntity top) {
        this.top = top;
    }

    public BackgroundEntity getBackground() {
        return background;
    }

    public void setBackground(BackgroundEntity background) {
        this.background = background;
    }

    public ModulesEntity getModules() {
        return modules;
    }

    public void setModules(ModulesEntity modules) {
        this.modules = modules;
    }

    public BottomEntity getBottom() {
        return bottom;
    }

    public void setBottom(BottomEntity bottom) {
        this.bottom = bottom;
    }

    public static class TopEntity {
        /**
         * logo_android : http://p23.tuan800.net/pic/wireless__52_1439201552056.png.webp
         * logo_ios : http://p23.tuan800.net/pic/wireless__52_1439201557577.png.webp
         * background : {"color":"e20c24"}
         * search_color : cf010b
         * cart_android : http://p23.tuan800.net/pic/wireless__52_1438335082389.png.webp
         * cart_ios : http://p23.tuan800.net/pic/wireless__134_1439201875697.png.webp
         * tag_bg : {"color":"ffffff","font_before":"545c66","font_after":"e30c26"}
         */

        private String logo_android;
        private String logo_ios;
        private BackgroundEntity background;
        private String search_color;
        private String cart_android;
        private String cart_ios;
        private TagBgEntity tag_bg;

        public String getLogo_android() {
            return logo_android;
        }

        public void setLogo_android(String logo_android) {
            this.logo_android = logo_android;
        }

        public String getLogo_ios() {
            return logo_ios;
        }

        public void setLogo_ios(String logo_ios) {
            this.logo_ios = logo_ios;
        }

        public BackgroundEntity getBackground() {
            return background;
        }

        public void setBackground(BackgroundEntity background) {
            this.background = background;
        }

        public String getSearch_color() {
            return search_color;
        }

        public void setSearch_color(String search_color) {
            this.search_color = search_color;
        }

        public String getCart_android() {
            return cart_android;
        }

        public void setCart_android(String cart_android) {
            this.cart_android = cart_android;
        }

        public String getCart_ios() {
            return cart_ios;
        }

        public void setCart_ios(String cart_ios) {
            this.cart_ios = cart_ios;
        }

        public TagBgEntity getTag_bg() {
            return tag_bg;
        }

        public void setTag_bg(TagBgEntity tag_bg) {
            this.tag_bg = tag_bg;
        }

        public static class BackgroundEntity {
            /**
             * color : e20c24
             */

            private String color;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }

        public static class TagBgEntity {
            /**
             * color : ffffff
             * font_before : 545c66
             * font_after : e30c26
             */

            private String color;
            private String font_before;
            private String font_after;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getFont_before() {
                return font_before;
            }

            public void setFont_before(String font_before) {
                this.font_before = font_before;
            }

            public String getFont_after() {
                return font_after;
            }

            public void setFont_after(String font_after) {
                this.font_after = font_after;
            }
        }
    }

    public static class BackgroundEntity {
        /**
         * color : f6f6f6
         */

        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static class ModulesEntity {
        /**
         * module1 : [{"id":383,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp","title_android":"","homekey":16},{"id":873,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/442x168.c73c814393378fca7d813a6375af941c.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/442x168.c73c814393378fca7d813a6375af941c.jpg.webp","title_android":"","homekey":18},{"id":349,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/442x168.d3dc2e518a72a7cabfbeafb320b72216.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/442x168.d3dc2e518a72a7cabfbeafb320b72216.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/bkzqn?dcurlid=349"}]
         * module2 : [{"id":507,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/zebjr1013?dcurlid=507"},{"id":399,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/375x168.cabd41c98c4926da82483c50dbcccd7c.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/375x168.cabd41c98c4926da82483c50dbcccd7c.jpg.webp","title_android":"","homekey":1,"value":"http://hd.zhe800.com/xindacu/app/pptop10n?dcurlid=399"},{"id":401,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/375x168.e8857d4823ed068d28f5c91a387cd0e4.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/375x168.e8857d4823ed068d28f5c91a387cd0e4.jpg.webp","title_android":"","homekey":1,"value":"http://th5.m.zhe800.com/activity/xianshi?dcurlid=401&pub_page_from=zheclient"},{"id":509,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/375x168.63f4d25e493c9fcf053e78e212efc2d3.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/375x168.63f4d25e493c9fcf053e78e212efc2d3.jpg.webp","title_android":"","homekey":1,"value":"http://th5.m.zhe800.com/h5public/youpinhui?dcurlid=509&pub_page_from=zheclient"}]
         * module3 : [{"id":355,"pic_android":"http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp","pic_ios":"http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp","title_android":"","homekey":7},{"id":491,"pic_android":"http://z3.tuanimg.com/imagev2/wxyy/236x318.c3e59770608a4a10a088a367982c3f93.jpg.webp","pic_ios":"http://z3.tuanimg.com/imagev2/wxyy/236x318.c3e59770608a4a10a088a367982c3f93.jpg.webp","title_android":"","homekey":15},{"id":357,"pic_android":"","pic_ios":"","title_android":"","homekey":14}]
         * mobile_pic : http://p23.tuan800.net/pic/wireless_home_mobile_image51_189_1439804882705.png.webp
         */

        private String mobile_pic;
        private List<Module1Entity> module1;
        private List<Module2Entity> module2;
        private List<Module3Entity> module3;

        public String getMobile_pic() {
            return mobile_pic;
        }

        public void setMobile_pic(String mobile_pic) {
            this.mobile_pic = mobile_pic;
        }

        public List<Module1Entity> getModule1() {
            return module1;
        }

        public void setModule1(List<Module1Entity> module1) {
            this.module1 = module1;
        }

        public List<Module2Entity> getModule2() {
            return module2;
        }

        public void setModule2(List<Module2Entity> module2) {
            this.module2 = module2;
        }

        public List<Module3Entity> getModule3() {
            return module3;
        }

        public void setModule3(List<Module3Entity> module3) {
            this.module3 = module3;
        }

        public static class Module1Entity {
            /**
             * id : 383
             * pic_android : http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp
             * pic_ios : http://z3.tuanimg.com/imagev2/wxyy/306x336.b01d99d74f9640b4f4a5b33f99ccfd46.jpg.webp
             * title_android :
             * homekey : 16
             */

            private int id;
            private String pic_android;
            private String pic_ios;
            private String title_android;
            private int homekey;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPic_android() {
                return pic_android;
            }

            public void setPic_android(String pic_android) {
                this.pic_android = pic_android;
            }

            public String getPic_ios() {
                return pic_ios;
            }

            public void setPic_ios(String pic_ios) {
                this.pic_ios = pic_ios;
            }

            public String getTitle_android() {
                return title_android;
            }

            public void setTitle_android(String title_android) {
                this.title_android = title_android;
            }

            public int getHomekey() {
                return homekey;
            }

            public void setHomekey(int homekey) {
                this.homekey = homekey;
            }
        }

        public static class Module2Entity {
            /**
             * id : 507
             * pic_android : http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp
             * pic_ios : http://z3.tuanimg.com/imagev2/wxyy/375x168.63f1666bcf6c0ef60b077c3739336b88.jpg.webp
             * title_android :
             * homekey : 1
             * value : http://hd.zhe800.com/xindacu/app/zebjr1013?dcurlid=507
             */

            private int id;
            private String pic_android;
            private String pic_ios;
            private String title_android;
            private int homekey;
            private String value;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPic_android() {
                return pic_android;
            }

            public void setPic_android(String pic_android) {
                this.pic_android = pic_android;
            }

            public String getPic_ios() {
                return pic_ios;
            }

            public void setPic_ios(String pic_ios) {
                this.pic_ios = pic_ios;
            }

            public String getTitle_android() {
                return title_android;
            }

            public void setTitle_android(String title_android) {
                this.title_android = title_android;
            }

            public int getHomekey() {
                return homekey;
            }

            public void setHomekey(int homekey) {
                this.homekey = homekey;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class Module3Entity {
            /**
             * id : 355
             * pic_android : http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp
             * pic_ios : http://z2.tuanimg.com/imagev2/wxyy/236x318.771e2faef094509ddb3febdf32153e50.jpg.webp
             * title_android :
             * homekey : 7
             */

            private int id;
            private String pic_android;
            private String pic_ios;
            private String title_android;
            private int homekey;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPic_android() {
                return pic_android;
            }

            public void setPic_android(String pic_android) {
                this.pic_android = pic_android;
            }

            public String getPic_ios() {
                return pic_ios;
            }

            public void setPic_ios(String pic_ios) {
                this.pic_ios = pic_ios;
            }

            public String getTitle_android() {
                return title_android;
            }

            public void setTitle_android(String title_android) {
                this.title_android = title_android;
            }

            public int getHomekey() {
                return homekey;
            }

            public void setHomekey(int homekey) {
                this.homekey = homekey;
            }
        }
    }

    public static class BottomEntity {
        /**
         * color : ffffff
         * icons : [{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidBefore_237_1438252892223.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidAfter_237_1438252905246.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_homeIosBefore_237_1438252921993.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_homeIosAfter_237_1438252929975.png.webp","icon_type":1},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_tagAndroidBefore_237_1438252946794.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_tagAndroidAfter_237_1438252988711.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_tagIosBefore_237_1438253033806.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_tagIosAfter_237_1438253103587.png.webp","icon_type":2},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_brandAndroidBefore_237_1438252954314.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_brandAndroidAfter_237_1438252995928.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_brandIosBefore_237_1438253043136.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_brandIosAfter_237_1438253110874.png.webp","icon_type":3},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_pointAndroidBefore_237_1438252961623.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_pointAndroidAfter_237_1438253003552.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_pointIosBefore_237_1438253050240.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_pointIosAfter_237_1438253116944.png.webp","icon_type":4},{"icon_before_android":"http://p23.tuan800.net/pic/wireless_home_foot_userAndroidBefore_237_1438252970694.png.webp","icon_after_android":"http://p23.tuan800.net/pic/wireless_home_foot_userAndroidAfter_237_1438253016428.png.webp","icon_before_ios":"http://p23.tuan800.net/pic/wireless_home_foot_userIosBefore_237_1438253064360.png.webp","icon_after_ios":"http://p23.tuan800.net/pic/wireless_home_foot_userIosAfter_237_1438253122893.png.webp","icon_type":5}]
         */

        private String color;
        private List<IconsEntity> icons;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public List<IconsEntity> getIcons() {
            return icons;
        }

        public void setIcons(List<IconsEntity> icons) {
            this.icons = icons;
        }

        public static class IconsEntity {
            /**
             * icon_before_android : http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidBefore_237_1438252892223.png.webp
             * icon_after_android : http://p23.tuan800.net/pic/wireless_home_foot_homeAndroidAfter_237_1438252905246.png.webp
             * icon_before_ios : http://p23.tuan800.net/pic/wireless_home_foot_homeIosBefore_237_1438252921993.png.webp
             * icon_after_ios : http://p23.tuan800.net/pic/wireless_home_foot_homeIosAfter_237_1438252929975.png.webp
             * icon_type : 1
             */

            private String icon_before_android;
            private String icon_after_android;
            private String icon_before_ios;
            private String icon_after_ios;
            private int icon_type;

            public String getIcon_before_android() {
                return icon_before_android;
            }

            public void setIcon_before_android(String icon_before_android) {
                this.icon_before_android = icon_before_android;
            }

            public String getIcon_after_android() {
                return icon_after_android;
            }

            public void setIcon_after_android(String icon_after_android) {
                this.icon_after_android = icon_after_android;
            }

            public String getIcon_before_ios() {
                return icon_before_ios;
            }

            public void setIcon_before_ios(String icon_before_ios) {
                this.icon_before_ios = icon_before_ios;
            }

            public String getIcon_after_ios() {
                return icon_after_ios;
            }

            public void setIcon_after_ios(String icon_after_ios) {
                this.icon_after_ios = icon_after_ios;
            }

            public int getIcon_type() {
                return icon_type;
            }

            public void setIcon_type(int icon_type) {
                this.icon_type = icon_type;
            }
        }
    }
}
