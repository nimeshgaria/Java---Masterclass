package com.company.Section11.Scope;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        String privateVar = "main()";
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.getPublicVar();
        ScopeCheck scopeInstance = new ScopeCheck();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();

    }
}
