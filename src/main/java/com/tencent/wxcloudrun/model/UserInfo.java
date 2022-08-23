package com.tencent.wxcloudrun.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author PangYu
 * @since 2022-08-03
 */
@Getter
@Setter
@TableName("User_Info")
@ApiModel(value = "UserInfo对象", description = "")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("联系方式")
    private String tel;

    @ApiModelProperty("投票地址")
    private String voteAdress;

    @ApiModelProperty("描述")
    private String descInfo;

    @ApiModelProperty("得票数")
    private Integer voteCount;

    @ApiModelProperty("版本号")
    private Integer versionNum;

    @ApiModelProperty("图片存储地址1")
    private String imgUrl1;

    @ApiModelProperty("图片存储地址2")
    private String imgUrl2;

    @ApiModelProperty("图片存储地址3")
    private String imgUrl3;

    @ApiModelProperty("记录创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("记录更新时间")
    private LocalDateTime modifyTime;


}
