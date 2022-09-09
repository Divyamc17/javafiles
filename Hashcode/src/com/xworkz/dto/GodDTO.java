package com.xworkz.dto;

public class GodDTO {

	
	private Integer classification;
	private String enumeration;
	private boolean goodness;
	private boolean asiety;
	private boolean holiness;
	private String eternity;
	private String immanence;
	private String immutable;
	private String imapssibility;
	private boolean incorporeality;
	private boolean infinity;
	private boolean jealous;
	private String love;
	private String mission;
	private String mystry;
	private boolean omniscent;
	private boolean omnipotence;
	private boolean onmipresence;
	private boolean oneness;
	private boolean providence;
	private boolean righteousness;
	private boolean simplicity;
	private boolean sovereignty;
	private String transcendence;
	private String trinity;
	private String veracity;
	private boolean wrath;
	private Integer typesOfGods;
	private String sanathanDharma;
	private String snathanGods;
	private String creature;
	private String ruelerGod;
	private String preserver;
	private Integer preserverAvatar;
	private Integer creatureAvathar;
	private Integer rulerAvathar;
	private Integer rulerLngus;
	private String rulerBirthPlace;
	private String preserverBirthPlace;
	private String creatureBirthPlace;
	private String firstAvathar;
	private String secondAvathar;
	private String thirdAvathar;
	private String fourthAvathar;
	private String fifthAvathar;

	
	@Override
	public int hashCode() {

		return 25;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Parent class Object obj is not null");
			if (obj instanceof GodDTO) {
				GodDTO converted = (GodDTO) obj;
				if (converted.mission.equals(this.mission) && converted.mystry.equals(this.mystry)) {
					System.out.println("both are same");
					return true;
				}
			} else {
				System.out.println("obj is null");
			}

		}
		return super.equals(obj);
	}


	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

	public boolean isGoodness() {
		return goodness;
	}

	public void setGoodness(boolean goodness) {
		this.goodness = goodness;
	}

	public boolean isAsiety() {
		return asiety;
	}

	public void setAsiety(boolean asiety) {
		this.asiety = asiety;
	}

	public boolean isHoliness() {
		return holiness;
	}

	public void setHoliness(boolean holiness) {
		this.holiness = holiness;
	}

	public String getEternity() {
		return eternity;
	}

	public void setEternity(String eternity) {
		this.eternity = eternity;
	}

	public String getImmanence() {
		return immanence;
	}

	public void setImmanence(String immanence) {
		this.immanence = immanence;
	}

	public String getImmutable() {
		return immutable;
	}

	public void setImmutable(String immutable) {
		this.immutable = immutable;
	}

	public String getImapssibility() {
		return imapssibility;
	}

	public void setImapssibility(String imapssibility) {
		this.imapssibility = imapssibility;
	}

	public boolean isIncorporeality() {
		return incorporeality;
	}

	public void setIncorporeality(boolean incorporeality) {
		this.incorporeality = incorporeality;
	}

	public boolean isInfinity() {
		return infinity;
	}

	public void setInfinity(boolean infinity) {
		this.infinity = infinity;
	}

	public boolean isJealous() {
		return jealous;
	}

	public void setJealous(boolean jealous) {
		this.jealous = jealous;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getMystry() {
		return mystry;
	}

	public void setMystry(String mystry) {
		this.mystry = mystry;
	}

	public boolean isOmniscent() {
		return omniscent;
	}

	public void setOmniscent(boolean omniscent) {
		this.omniscent = omniscent;
	}

	public boolean isOmnipotence() {
		return omnipotence;
	}

	public void setOmnipotence(boolean omnipotence) {
		this.omnipotence = omnipotence;
	}

	public boolean isOnmipresence() {
		return onmipresence;
	}

	public void setOnmipresence(boolean onmipresence) {
		this.onmipresence = onmipresence;
	}

	public boolean isOneness() {
		return oneness;
	}

	public void setOneness(boolean oneness) {
		this.oneness = oneness;
	}

	public boolean isProvidence() {
		return providence;
	}

	public void setProvidence(boolean providence) {
		this.providence = providence;
	}

	public boolean isRighteousness() {
		return righteousness;
	}

	public void setRighteousness(boolean righteousness) {
		this.righteousness = righteousness;
	}

	public boolean isSimplicity() {
		return simplicity;
	}

	public void setSimplicity(boolean simplicity) {
		this.simplicity = simplicity;
	}

	public boolean isSovereignty() {
		return sovereignty;
	}

	public void setSovereignty(boolean sovereignty) {
		this.sovereignty = sovereignty;
	}

	public String getTranscendence() {
		return transcendence;
	}

	public void setTranscendence(String transcendence) {
		this.transcendence = transcendence;
	}

	public String getTrinity() {
		return trinity;
	}

	public void setTrinity(String trinity) {
		this.trinity = trinity;
	}

	public String getVeracity() {
		return veracity;
	}

	public void setVeracity(String veracity) {
		this.veracity = veracity;
	}

	public boolean isWrath() {
		return wrath;
	}

	public void setWrath(boolean wrath) {
		this.wrath = wrath;
	}

	public Integer getTypesOfGods() {
		return typesOfGods;
	}

	public void setTypesOfGods(Integer typesOfGods) {
		this.typesOfGods = typesOfGods;
	}

	public String getSanathanDharma() {
		return sanathanDharma;
	}

	public void setSanathanDharma(String sanathanDharma) {
		this.sanathanDharma = sanathanDharma;
	}

	public String getSnathanGods() {
		return snathanGods;
	}

	public void setSnathanGods(String snathanGods) {
		this.snathanGods = snathanGods;
	}

	public String getCreature() {
		return creature;
	}

	public void setCreature(String creature) {
		this.creature = creature;
	}

	public String getRuelerGod() {
		return ruelerGod;
	}

	public void setRuelerGod(String ruelerGod) {
		this.ruelerGod = ruelerGod;
	}

	public String getPreserver() {
		return preserver;
	}

	public void setPreserver(String preserver) {
		this.preserver = preserver;
	}

	public Integer getPreserverAvatar() {
		return preserverAvatar;
	}

	public void setPreserverAvatar(Integer preserverAvatar) {
		this.preserverAvatar = preserverAvatar;
	}

	public Integer getCreatureAvathar() {
		return creatureAvathar;
	}

	public void setCreatureAvathar(Integer creatureAvathar) {
		this.creatureAvathar = creatureAvathar;
	}

	public Integer getRulerAvathar() {
		return rulerAvathar;
	}

	public void setRulerAvathar(Integer rulerAvathar) {
		this.rulerAvathar = rulerAvathar;
	}

	public Integer getRulerLngus() {
		return rulerLngus;
	}

	public void setRulerLngus(Integer rulerLngus) {
		this.rulerLngus = rulerLngus;
	}

	public String getRulerBirthPlace() {
		return rulerBirthPlace;
	}

	public void setRulerBirthPlace(String rulerBirthPlace) {
		this.rulerBirthPlace = rulerBirthPlace;
	}

	public String getPreserverBirthPlace() {
		return preserverBirthPlace;
	}

	public void setPreserverBirthPlace(String preserverBirthPlace) {
		this.preserverBirthPlace = preserverBirthPlace;
	}

	public String getCreatureBirthPlace() {
		return creatureBirthPlace;
	}

	public void setCreatureBirthPlace(String creatureBirthPlace) {
		this.creatureBirthPlace = creatureBirthPlace;
	}

	public String getFirstAvathar() {
		return firstAvathar;
	}

	public void setFirstAvathar(String firstAvathar) {
		this.firstAvathar = firstAvathar;
	}

	public String getSecondAvathar() {
		return secondAvathar;
	}

	public void setSecondAvathar(String secondAvathar) {
		this.secondAvathar = secondAvathar;
	}

	public String getThirdAvathar() {
		return thirdAvathar;
	}

	public void setThirdAvathar(String thirdAvathar) {
		this.thirdAvathar = thirdAvathar;
	}

	public String getFourthAvathar() {
		return fourthAvathar;
	}

	public void setFourthAvathar(String fourthAvathar) {
		this.fourthAvathar = fourthAvathar;
	}

	public String getFifthAvathar() {
		return fifthAvathar;
	}

	public void setFifthAvathar(String fifthAvathar) {
		this.fifthAvathar = fifthAvathar;
	}

	}

