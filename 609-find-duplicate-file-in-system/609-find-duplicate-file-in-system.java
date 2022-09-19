class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
            List<List<String>> result = new ArrayList<>();
        if (paths.length == 0) 
            return result;
        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] strings = path.split(" ");
            String directory = strings[0];
		    for (int i = 1; i < strings.length; i++) {
                int index = strings[i].indexOf("(");
                String content = strings[i].substring(index);
                String filename = directory + "/" + strings[i].substring(0, index);
                List<String> filenames = map.getOrDefault(content, new ArrayList<>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }

        return result;

    }
}