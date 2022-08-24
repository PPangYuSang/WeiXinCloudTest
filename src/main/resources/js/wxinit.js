window.onload = async function () {
    var c1 = new cloud.Cloud({
      identityless: true,
      resourceAppid:   'wxd5c012e3be5385cf', //微信云托管所在的「小程序/公众号」appid' 替换成自己的
      resourceEnv: "prod-9g1zmd9a51138f3e" //"微信云托管环境ID" // 替换成自己的
    });
    await c1.init();

    const res = await c1.callContainer({
      path: '/',
      method: 'GET',
      header: {
        'X-WX-SERVICE': 'demo'
      }
    });

    console.log(res); // 在控制台里查看打印
  }