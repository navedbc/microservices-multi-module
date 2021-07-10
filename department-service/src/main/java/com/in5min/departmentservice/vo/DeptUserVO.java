package com.in5min.departmentservice.vo;

import com.in5min.departmentservice.model.Dept;

public class DeptUserVO {

    Dept dept;

    User user;

    public DeptUserVO() {
    }

    public DeptUserVO(Dept dept, User user) {
        this.dept = dept;
        this.user = user;
    }

    public Dept getDept() {
        return this.dept;
    }

    public User getUser() {
        return this.user;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeptUserVO)) return false;
        final DeptUserVO other = (DeptUserVO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$dept = this.getDept();
        final Object other$dept = other.getDept();
        if (this$dept == null ? other$dept != null : !this$dept.equals(other$dept)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeptUserVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $dept = this.getDept();
        result = result * PRIME + ($dept == null ? 43 : $dept.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "DeptUserVO(dept=" + this.getDept() + ", user=" + this.getUser() + ")";
    }
}
