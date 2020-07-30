package me.minidigger.hangar.security.authorities;

import me.minidigger.hangar.model.NamedPermission;
import org.springframework.security.core.GrantedAuthority;

public class PermissionAuthority implements GrantedAuthority {
    private final NamedPermission permission;

    public PermissionAuthority(NamedPermission permission) {
        this.permission = permission;
    }

    @Override
    public int hashCode() {
        return this.permission.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof PermissionAuthority) {
            return permission == (((PermissionAuthority) obj).permission);
        }
        return false;
    }

    @Override
    public String toString() {
        return permission.toString();
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
