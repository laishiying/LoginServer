package com.hxyl.jason.entity;

/**
 * 
 * @author jason
 */
public class WpUser {
	/**
	 *  
	 */
	private Integer userId;
	/**
	 *  用户姓名
	 */
	private String userName;
	/**
	 *  手机
	 */
	private String phone;
	/**
	 *  用户密码
	 */
	private String userPassword;
	/**
	 *  工号
	 */
	private String workNumber;
	/**
	 *  座机号码
	 */
	private String landline;
	/**
	 *  网线ip
	 */
	private String ipconfig;
	/**
	 *  用户状态（0）无效，（1）有效
	 */
	private Integer state;
	/**
	 *  入职时间
	 */
	private String inductionTime;
	/**
	 *  住址
	 */
	private String address;
	/**
	 *  性别
	 */
	private String sex;
	/**
	 *  身份证号
	 */
	private String idnumber;
	/**
	 *  学历
	 */
	private String education;
	/**
	 *  所属组织id
	 */
	private String organizationId;
	/**
	 *  上次登录时
	 */
	private String lastLogin;
	/**
	 *  登录次数
	 */
	private String loginCount;
	/**
	 *  创建时间
	 */
	private String creationTime;
	/**
	 *  创建人id
	 */
	private Integer creationPeopleId;
	/**
	 *  修改时间
	 */
	private String modifyTime;
	/**
	 *  修改人id
	 */
	private Integer modifyPeoleId;

	/**
	 *  返回状态
	 */
	private Integer label;

	/**
	 *  返回状态信息
	 */
	public String information;
	/**
	 * Token
	 * */
	public String tokenid;

	public String getTokenid() {
		return tokenid;
	}

	public void setTokenid(String tokenid) {
		this.tokenid = tokenid;
	}


	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Integer getLabel() {
		return label;
	}

	public void setLabel(Integer label) {
		this.label = label;
	}
	/**
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户姓名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户姓名
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 手机
	 * @param phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	
    /**
     * 手机
     * @return
     */	
    public String getPhone(){
    	return phone;
    }
	/**
	 * 用户密码
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPassword(){
    	return userPassword;
    }
	/**
	 * 工号
	 * @param workNumber
	 */
	public void setWorkNumber(String workNumber){
		this.workNumber = workNumber;
	}
	
    /**
     * 工号
     * @return
     */	
    public String getWorkNumber(){
    	return workNumber;
    }
	/**
	 * 座机号码
	 * @param landline
	 */
	public void setLandline(String landline){
		this.landline = landline;
	}
	
    /**
     * 座机号码
     * @return
     */	
    public String getLandline(){
    	return landline;
    }
	/**
	 * 网线ip
	 * @param ipconfig
	 */
	public void setIpconfig(String ipconfig){
		this.ipconfig = ipconfig;
	}
	
    /**
     * 网线ip
     * @return
     */	
    public String getIpconfig(){
    	return ipconfig;
    }
	/**
	 * 用户状态（0）无效，（1）有效
	 * @param state
	 */
	public void setState(Integer state){
		this.state = state;
	}
	
    /**
     * 用户状态（0）无效，（1）有效
     * @return
     */	
    public Integer getState(){
    	return state;
    }
	/**
	 * 入职时间
	 * @param inductionTime
	 */
	public void setInductionTime(String inductionTime){
		this.inductionTime = inductionTime;
	}
	
    /**
     * 入职时间
     * @return
     */	
    public String getInductionTime(){
    	return inductionTime;
    }
	/**
	 * 住址
	 * @param address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
    /**
     * 住址
     * @return
     */	
    public String getAddress(){
    	return address;
    }
	/**
	 * 性别
	 * @param sex
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	
    /**
     * 性别
     * @return
     */	
    public String getSex(){
    	return sex;
    }
	/**
	 * 身份证号
	 * @param idnumber
	 */
	public void setIdnumber(String idnumber){
		this.idnumber = idnumber;
	}
	
    /**
     * 身份证号
     * @return
     */	
    public String getIdnumber(){
    	return idnumber;
    }
	/**
	 * 学历
	 * @param education
	 */
	public void setEducation(String education){
		this.education = education;
	}
	
    /**
     * 学历
     * @return
     */	
    public String getEducation(){
    	return education;
    }
	/**
	 * 所属组织id
	 * @param organizationId
	 */
	public void setOrganizationId(String organizationId){
		this.organizationId = organizationId;
	}
	
    /**
     * 所属组织id
     * @return
     */	
    public String getOrganizationId(){
    	return organizationId;
    }
	/**
	 * 上次登录时
	 * @param lastLogin
	 */
	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}
	
    /**
     * 上次登录时
     * @return
     */	
    public String getLastLogin(){
    	return lastLogin;
    }
	/**
	 * 登录次数
	 * @param loginCount
	 */
	public void setLoginCount(String loginCount){
		this.loginCount = loginCount;
	}
	
    /**
     * 登录次数
     * @return
     */	
    public String getLoginCount(){
    	return loginCount;
    }
	/**
	 * 创建时间
	 * @param creationTime
	 */
	public void setCreationTime(String creationTime){
		this.creationTime = creationTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public String getCreationTime(){
    	return creationTime;
    }
	/**
	 * 创建人id
	 * @param creationPeopleId
	 */
	public void setCreationPeopleId(Integer creationPeopleId){
		this.creationPeopleId = creationPeopleId;
	}
	
    /**
     * 创建人id
     * @return
     */	
    public Integer getCreationPeopleId(){
    	return creationPeopleId;
    }
	/**
	 * 修改时间
	 * @param modifyTime
	 */
	public void setModifyTime(String modifyTime){
		this.modifyTime = modifyTime;
	}
	
    /**
     * 修改时间
     * @return
     */	
    public String getModifyTime(){
    	return modifyTime;
    }
	/**
	 * 修改人id
	 * @param modifyPeoleId
	 */
	public void setModifyPeoleId(Integer modifyPeoleId){
		this.modifyPeoleId = modifyPeoleId;
	}
	
    /**
     * 修改人id
     * @return
     */	
    public Integer getModifyPeoleId(){
    	return modifyPeoleId;
    }


	public int getLists() {
		return lists;
	}

	public void setLists(int lists) {
		this.lists = lists;
	}

	public int lists;
}