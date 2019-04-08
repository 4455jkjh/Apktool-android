package com.a4455jkjh.smali;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.MethodParameter;

public class SmaliMethodParamter implements MethodParameter {
	private final String type;
	private String name;

	private final ImmutableSet.Builder<Annotation> annotations;
int i;
	public SmaliMethodParamter(String type) {
		this.type = type;
		annotations = new ImmutableSet.Builder<>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAnnotation(Annotation annotation) {
		annotations.add(annotation);
	}
	@Override
	public int length() {
		return type.length();
	}

	@Override
	public char charAt(int p1) {
		return type.charAt(p1);
	}

	@Override
	public String toString() {
		return type;
	}

	@Override
	public CharSequence subSequence(int p1, int p2) {
		return type.subSequence(p1, p2);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public Set<? extends Annotation> getAnnotations() {
		return annotations.build();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSignature() {
		return null;
	}

	@Override
	public int compareTo(CharSequence p1) {
		return type.compareTo(p1.toString());
	}

	@Override
	public int hashCode() {
		return type.hashCode();
	}

}
