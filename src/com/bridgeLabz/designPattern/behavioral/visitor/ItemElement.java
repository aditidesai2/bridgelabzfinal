package com.bridgeLabz.designPattern.behavioral.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}