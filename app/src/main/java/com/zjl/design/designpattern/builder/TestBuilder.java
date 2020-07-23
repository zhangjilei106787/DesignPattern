package com.zjl.design.designpattern.builder;

/**
 * 建造者模式
 */
public class TestBuilder {
    private String name;
    private String address;
    private String aox;
    private String sax;
    private String ly;
    private String design;

    private TestBuilder(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.aox = builder.aox;
        this.sax = builder.sax;
        this.ly = builder.ly;
        this.design = builder.design;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAox() {
        return aox;
    }

    public void setAox(String aox) {
        this.aox = aox;
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        this.sax = sax;
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    private static class Builder {
        private String name;
        private String address;
        private String aox;
        private String sax;
        private String ly;
        private String design;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder aox(String aox) {
            this.aox = aox;
            return this;
        }

        public Builder sax(String sax) {
            this.sax = sax;
            return this;
        }

        public Builder ly(String ly) {
            this.ly = ly;
            return this;
        }

        public Builder design(String design) {
            this.design = design;
            return this;
        }


        public TestBuilder build() {
            return new TestBuilder(this);
        }
    }

    public static void main(String[] args) {
        TestBuilder testBuilder = new Builder().address("beijin").name("李四").build();
        String name = testBuilder.getName();
        String aox = testBuilder.getAox();
        System.out.println("name===="+name);
        System.out.println("aox==="+aox);
    }

}
