/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * stream view type
 */
public enum StreamViewType implements libthrift091.TEnum {
  KEYS_ONLY(1),
  EDITS(2),
  NEW_IMAGE(3);

  private final int value;

  private StreamViewType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StreamViewType findByValue(int value) { 
    switch (value) {
      case 1:
        return KEYS_ONLY;
      case 2:
        return EDITS;
      case 3:
        return NEW_IMAGE;
      default:
        return null;
    }
  }
}
