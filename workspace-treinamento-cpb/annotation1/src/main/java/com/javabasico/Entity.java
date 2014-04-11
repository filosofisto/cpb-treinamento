package com.javabasico;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Entity {

	@Override
	public boolean equals(Object object) {
		if (getClass().equals(object.getClass())) {
			try {
				Object myId = getGetterId().invoke(this);
				Object otherId = getGetterId().invoke(object);

				if (myId == null && otherId == null) {
					return true;
				} else {
					if (myId != null) {
						return myId.equals(otherId);
					} else {
						return false;
					}
				}
			} catch (IllegalArgumentException e) {
				return false;
			} catch (SecurityException e) {
				return false;
			} catch (IllegalAccessException e) {
				return false;
			} catch (InvocationTargetException e) {
				return false;
			} catch (NoSuchMethodException e) {
				return false;
			}
		}

		return false;
	}

	private Method getGetterId() throws SecurityException,
			NoSuchMethodException {
		Field[] fields = getClass().getDeclaredFields();
		Field fieldId = null;

		for (Field field : fields) {
			if (field.getAnnotation(Id.class) != null) {
				fieldId = field;
				break;
			}
		}

		if (fieldId != null) {
			return getClass().getMethod(getGetterName(fieldId));
		}

		return null;
	}

	private String getGetterName(Field field) {
		return "get" + field.getName().substring(0, 1).toUpperCase()
				+ field.getName().substring(1);
	}
}
