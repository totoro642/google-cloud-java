// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/cvss.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface CVSSv3OrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.CVSSv3)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The base score is a function of the base metric scores.
   * </pre>
   *
   * <code>float base_score = 1;</code>
   * @return The baseScore.
   */
  float getBaseScore();

  /**
   * <code>float exploitability_score = 2;</code>
   * @return The exploitabilityScore.
   */
  float getExploitabilityScore();

  /**
   * <code>float impact_score = 3;</code>
   * @return The impactScore.
   */
  float getImpactScore();

  /**
   * <pre>
   * Base Metrics
   * Represents the intrinsic characteristics of a vulnerability that are
   * constant over time and across user environments.
   * </pre>
   *
   * <code>.grafeas.v1.CVSSv3.AttackVector attack_vector = 5;</code>
   * @return The enum numeric value on the wire for attackVector.
   */
  int getAttackVectorValue();
  /**
   * <pre>
   * Base Metrics
   * Represents the intrinsic characteristics of a vulnerability that are
   * constant over time and across user environments.
   * </pre>
   *
   * <code>.grafeas.v1.CVSSv3.AttackVector attack_vector = 5;</code>
   * @return The attackVector.
   */
  io.grafeas.v1.CVSSv3.AttackVector getAttackVector();

  /**
   * <code>.grafeas.v1.CVSSv3.AttackComplexity attack_complexity = 6;</code>
   * @return The enum numeric value on the wire for attackComplexity.
   */
  int getAttackComplexityValue();
  /**
   * <code>.grafeas.v1.CVSSv3.AttackComplexity attack_complexity = 6;</code>
   * @return The attackComplexity.
   */
  io.grafeas.v1.CVSSv3.AttackComplexity getAttackComplexity();

  /**
   * <code>.grafeas.v1.CVSSv3.PrivilegesRequired privileges_required = 7;</code>
   * @return The enum numeric value on the wire for privilegesRequired.
   */
  int getPrivilegesRequiredValue();
  /**
   * <code>.grafeas.v1.CVSSv3.PrivilegesRequired privileges_required = 7;</code>
   * @return The privilegesRequired.
   */
  io.grafeas.v1.CVSSv3.PrivilegesRequired getPrivilegesRequired();

  /**
   * <code>.grafeas.v1.CVSSv3.UserInteraction user_interaction = 8;</code>
   * @return The enum numeric value on the wire for userInteraction.
   */
  int getUserInteractionValue();
  /**
   * <code>.grafeas.v1.CVSSv3.UserInteraction user_interaction = 8;</code>
   * @return The userInteraction.
   */
  io.grafeas.v1.CVSSv3.UserInteraction getUserInteraction();

  /**
   * <code>.grafeas.v1.CVSSv3.Scope scope = 9;</code>
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   * <code>.grafeas.v1.CVSSv3.Scope scope = 9;</code>
   * @return The scope.
   */
  io.grafeas.v1.CVSSv3.Scope getScope();

  /**
   * <code>.grafeas.v1.CVSSv3.Impact confidentiality_impact = 10;</code>
   * @return The enum numeric value on the wire for confidentialityImpact.
   */
  int getConfidentialityImpactValue();
  /**
   * <code>.grafeas.v1.CVSSv3.Impact confidentiality_impact = 10;</code>
   * @return The confidentialityImpact.
   */
  io.grafeas.v1.CVSSv3.Impact getConfidentialityImpact();

  /**
   * <code>.grafeas.v1.CVSSv3.Impact integrity_impact = 11;</code>
   * @return The enum numeric value on the wire for integrityImpact.
   */
  int getIntegrityImpactValue();
  /**
   * <code>.grafeas.v1.CVSSv3.Impact integrity_impact = 11;</code>
   * @return The integrityImpact.
   */
  io.grafeas.v1.CVSSv3.Impact getIntegrityImpact();

  /**
   * <code>.grafeas.v1.CVSSv3.Impact availability_impact = 12;</code>
   * @return The enum numeric value on the wire for availabilityImpact.
   */
  int getAvailabilityImpactValue();
  /**
   * <code>.grafeas.v1.CVSSv3.Impact availability_impact = 12;</code>
   * @return The availabilityImpact.
   */
  io.grafeas.v1.CVSSv3.Impact getAvailabilityImpact();
}
