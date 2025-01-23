def call(String url, String branch){
  echo "cloning the repository"
  git branch: "${branch}", url: "${branch}"
}
