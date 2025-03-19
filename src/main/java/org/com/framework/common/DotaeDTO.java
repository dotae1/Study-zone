package org.com.framework.common;

public class DotaeDTO {


    private int age;
    private String job;
    private String name;

    public DotaeDTO() {
    }

    public DotaeDTO(int age, String job, String name) {
        this.age = age;
        this.job = job;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DotaeDTO{" +
                "age=" + age + '\'' +
                ", job=" + job + '\'' +
                ", name=" + name + '\'' +
                '}';
    }
}
