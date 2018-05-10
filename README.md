Git 提交到项目Github

配置SSH keys 生成秘钥

$ ssh-keygen -t rsa -C “601600361@qq.com”

步骤
1.建立git仓库  git init

2.添加文件到仓库 git add .

3.提交add的文件到仓库  git commit -m "注释"

4. 将本地的仓库关联到github上 git remote add origin git@github.com:wangjiax9/beautifulDay.g

5.更新本地的代码 git pull -u origin master

6.提交代码到远程仓库 git push -u origin master

xiawoen1314jun../
