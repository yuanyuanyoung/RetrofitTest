package com.yyy.retrofittest;

public class LoginData extends BaseBean {

    private UserBean data;

    public UserBean getData() {
	return data;
    }

    public void setData(UserBean data) {
	this.data = data;
    }

    @Override
    public String toString() {
	return "SimpleBaseBean [data=" + data + "]";
    }

}
