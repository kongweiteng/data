package com.datahub.data;

/**
 * 服务接口响应状态码枚举类
 */
public enum StatusCode {
    ERROR(500, "服务器错误，请联系管理员！"),
    SUCCESS(200, "成功!"),
    INSERT_SUCCESS(200, "保存成功"),
    UPDATA_SUCCESS(200, "编辑成功"),
    DELETE_SUCCESS(200, "删除成功"),
    DIDCARD_SUCCESS(200, "废弃成功"),
    F_A(201, "用户新建或修改数据成功!"),
    F_B(202, "请求已经进入后台排队!"),
    F_C(204, "用户删除数据成功!"),
    F_D(400, "用户发出的请求有错误，服务器没有进行新建或修改数据的操作!"),
    F_E(401, "用户没有权限!"),
    F_F(403, "表示用户得到授权（与401错误相对），但是访问是被禁止的!"),
    F_G(404, "用户发出的请求针对的是不存在的记录，服务器没有进行操作!"),
    F_H(406, "用户请求的格式不可得!"),
    F_I(410, "用户请求的资源被永久删除!"),
    F_J(422, "当创建一个对象时，发生一个验证错误!"),

    A(1000, "数据库错误!"),
    B(1001, "服务器错误!"),
    C(1002, "参数错误!"),
    D(1003, "token已失效，请重新获取！！"),
    E(1004, "ticket不存在或者已失效!!"),
    F(1005, "应用id或者密码错误!!"),
    G(1006, "用户名或密码错误!!"),
    H(1007, "图形验证码错误!!"),
    I(1008, "短信验证码错误!!"),
    J(1009, "用户手机号已注册！！"),
    K(1010, "用户手机号码不存在！！"),
    L(1011, "用户未登录！！"),
    M(1012, "密码错误！！"),
    N(1013, "OPENID错误！！"),
    O(1014, "邮箱重复！！"),
    P(1015, "手机号重复！！"),
    Q(1016, "登录名重复！！"),
    R(1017, "手机号码不正确！！"),
    S(1018, "邮箱格式错误！！"),
    T(1019, "用户名不存在!!"),
    U(1020, "没有权限!!"),
    V(1021, "密码输入错误次数过多，请15分钟后重试！"),
    W(1023, "用户状态异常！！"),
    X(1024, "用户已被锁定！！"),

    E_A(2000, "请求大数据平台发生错误---数据异常！！"),
    E_B(200, "请求数据为空！！"),
    E_C(2002, "请求外部服务错误！！"),
    E_D(2003, "企业信息不存在！！"),
    E_E(2004, "主账号不能登录！！"),
    E_F(2005, "用户企业信息不完整或者不存在！！"),
    E_G(2006, "大数据平台服务发生错误---服务异常！！"),
    E_H(2007, "请联系平台管理员开通权限！！！"),
    E_I(2008, "请联系售电公司管理员补充档案！！！"),
    E_J(2009, "数据不存在！！！"),
    E_K(2010, "数据处理超时！！");


    private final Integer code;
    private final String msg;

    StatusCode(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}